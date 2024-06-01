package ias.eventmanager.event.infraestructure.drivenadapter;

import ias.eventmanager.event.domain.model.EventModel;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface EventRepository extends ReactiveCrudRepository<EventModel, String> {

}
