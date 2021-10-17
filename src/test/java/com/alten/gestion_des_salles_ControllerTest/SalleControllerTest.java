package com.alten.gestion_des_salles_ControllerTest;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.validation.BindingResult;

import com.alten.gestiondessalles.controller.SalleController;
import com.alten.gestiondessalles.model.Materiel;
import com.alten.gestiondessalles.model.Salle;
import com.alten.gestiondessalles.service.SalleService;



@RunWith(SpringRunner.class)
@WebMvcTest(SalleController.class)
@AutoConfigureMockMvc
@ContextConfiguration(classes = AnnotationConfigContextLoader.class)
public class SalleControllerTest {
	
	private final Long idSalle =  1L;

	@Autowired
	private MockMvc mock;
	
	@InjectMocks
	private SalleController  salleController;
	
	@Mock
	BindingResult mockBindingResult;
	
	@Mock
	SalleService salleService;
	
	private Salle salle;
	private Materiel materiel;
	
	@Before
	public void setup() {
		
		MockitoAnnotations.initMocks(this);
		
		mock = MockMvcBuilders.standaloneSetup(salleController).build();

		Salle salle = new Salle(idSalle);
		salle.setCapaciteSalle(8);
		salle.setDateReservation(null);
		salle.setNomSalle("nom");
		salle.setReserved(true);
}
	
	/**
	 * Test method findAllSallesTest 
	 * 
	 * @throws Exception
	 */
	
	@Test
	public void findAllSallesTest() throws Exception {
		List<String> materiels = new ArrayList<String>();
		materiels.add("Ecran");
		List<Salle> salles = new ArrayList<>();
		salles.add(salle);
		when(salleService.findSalleByAttributs(8, "RC",materiels , null)).thenReturn(salle);
		
		mock.perform(MockMvcRequestBuilders.get("/api/salles")
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
	}
}
