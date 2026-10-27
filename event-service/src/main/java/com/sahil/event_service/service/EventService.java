package com.sahil.event_service.service;

import com.sahil.event_service.entities.Event;
import com.sahil.event_service.repositories.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event createEvent(Event event){
        return eventRepository.save(event);
    }

    public List<Event> getAllEvents(){
        return eventRepository.findAll();
    }
    public Optional<Event>getEventById(Long id){
        return eventRepository.findById(id);
    }
}
