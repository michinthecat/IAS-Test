package ias.eventmanager.event.domain.gateway;

import ias.eventmanager.event.domain.model.EventModel;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
public interface EventGateway {

     Flux<EventModel> findAll ();

     Mono<EventModel> findById(String id);

     Mono<EventModel> save(EventModel eventModel);

     Mono<Void> delete(String id);

     Mono<EventModel> update(EventModel eventModel);


}
