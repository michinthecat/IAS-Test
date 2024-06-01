package ias.eventmanager.event.infraestructure.entrypoint;

import ias.eventmanager.event.domain.model.EventModel;
import ias.eventmanager.event.domain.usecase.EventUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping
@RequiredArgsConstructor
@Validated
public class EventController {

    private final EventUseCase eventUseCase;

    @GetMapping("/events")
    public Flux<EventModel> listEvents()
    {
        return eventUseCase.findAll();
    }

    @PostMapping("/events")
    public Mono<EventModel> save(@Valid @RequestBody EventModel eventModel)
    {
        return eventUseCase.save(eventModel);
    }

    @GetMapping("/events/{id}")
    public Mono<EventModel> findById(@PathVariable String id)
    {
        return eventUseCase.findById(id);
    }

}
