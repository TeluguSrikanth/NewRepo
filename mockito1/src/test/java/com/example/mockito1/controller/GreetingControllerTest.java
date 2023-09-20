package com.example.mockito1.controller;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.mockito1.service.GreetingService;

@WebMvcTest(GreetingController.class)
public class GreetingControllerTest {

	 @Autowired
	    private MockMvc mockMvc;

	    @Mock
	    private GreetingService greetingService;

	    @InjectMocks
	    private GreetingController greetingController;

	    @BeforeEach
	    public void setup() {
	        MockitoAnnotations.openMocks(this);
	    }
	    
	    @Test
	    public void testGreet() throws Exception {
	        when(greetingService.getGreeting()).thenReturn("Hello SkSrikanth");

	        mockMvc.perform(MockMvcRequestBuilders.get("/greet"))
	               .andExpect(MockMvcResultMatchers.status().isOk())
	               .andExpect(MockMvcResultMatchers.content().string("Hello Srikanth"));
	    }

}
