package ias.eventmanager.user.domain.gateway;

import ias.eventmanager.user.domain.model.UserModel;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserGateway {

    public Mono<UserModel> save(UserModel userModel);

}
