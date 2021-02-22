package jalil.demo.firstTimers.post.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class PostHandler {
    public Mono<ServerResponse> postHandler(ServerRequest serverRequest){
        return ServerResponse.
                ok().
                contentType(MediaType.APPLICATION_JSON).
                body(Mono.just("Hey there"), String.class);
    }

}
