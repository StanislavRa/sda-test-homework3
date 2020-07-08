package com.sdatesthomework3.controller;

import com.sdatesthomework3.service.ReservationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author StanislavR
 */
@WebMvcTest(ReservationController.class)
class ReservationControllerTestWithoutServerWebLayerOnly {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ReservationService service;

    @Test
    void shouldReturn200AndResponse() throws Exception {

        when(service.reserve()).thenReturn("Reservation is completed successfully");

        mockMvc.perform(get("/success"))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().string("Reservation is completed successfully"));
    }
}
