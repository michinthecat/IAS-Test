package ias.eventmanager.event.infraestructure.drivenadapter;

import ias.eventmanager.event.domain.gateway.EventGateway;
import ias.eventmanager.event.domain.model.EventModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
@AllArgsConstructor
public class EventAdapterRepository implements EventGateway {

    private final EventRepository eventRepository;


    @Override
    public Flux<EventModel> findAll() {
        return eventRepository.findAll();
    }

    @Override
    public Mono<EventModel> findById(String id) {
        return eventRepository.findById(id);
    }

    @Override
    public Mono<EventModel> save(EventModel eventModel) {
        return eventRepository.save(eventModel);
    }

    @Override
    public Mono<Void> delete(String id) {
        return eventRepository.deleteById(id);
    }

    @Override
    public Mono<EventModel> update(EventModel eventModel) {
        return eventRepository.save(eventModel);
    }
}
