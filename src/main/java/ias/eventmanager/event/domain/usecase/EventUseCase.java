package ias.eventmanager.event.domain.usecase;

import ias.eventmanager.event.domain.gateway.EventGateway;
import ias.eventmanager.event.domain.model.EventModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class EventUseCase {

    private final EventGateway eventGateway;

    public Flux<EventModel> findAll (){
        return eventGateway.findAll();
    };

    public Mono<EventModel> findById(String id){
        return eventGateway.findById(id);
    };

    public Mono<EventModel> save(EventModel eventModel)
    {
        return eventGateway.save(eventModel);
    };

    public Mono<Void> delete(String id)
    {
        return eventGateway.delete(id);
    };

    public Mono<EventModel> update(EventModel eventModel)
    {
        return eventGateway.update(eventModel);
    };



}
