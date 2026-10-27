package com.sahil.event_service.controllers;

import com.sahil.event_service.entities.Event;
import com.sahil.event_service.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }
    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }
}
