package simpleMock.myProject.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import simpleMock.myProject.requests.MySimpleRequest;
import simpleMock.myProject.responses.MySimpleMap;
import simpleMock.myProject.responses.MySimpleRandom;
import simpleMock.myProject.responses.MySimpleRepository;
import simpleMock.myProject.responses.MySimpleResponse;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
    @RequestMapping("/simple-mock")
    public class MySimpleController {
    @PostMapping("/post")   //POST запрос
    public ResponseEntity<MySimpleResponse> post (@RequestBody MySimpleRequest request){
        MySimpleResponse response = new MySimpleResponse();
        response.setId(String.valueOf(request.getId()));
        response.setSum(request.getParamA()+request.getParamB());
        LocalDateTime now = LocalDateTime.now();
        MySimpleRepository.ids.add(String.valueOf(request.getId()));
        MySimpleMap.map.put(request.getId(), String.valueOf(now));
        System.out.println(request);
        return ResponseEntity.ok(response);
    }
    @GetMapping("/get_random")   //GET запрос случайное число
    public ResponseEntity<MySimpleRandom> get_random (){
        MySimpleRandom random = new MySimpleRandom();
        random.setRandom(random.getRandom());
        return ResponseEntity.ok(random);
    }
    @GetMapping("/get_repository")   //GET запрос возвращающий все id
    public List<String> get_repository (){return MySimpleRepository.ids;
    }
    @GetMapping("/get_map")   //GET возвращающий все id и время когда запрос пришел
    public Map<UUID, String> get_map (){
        return MySimpleMap.map;

    }
    }


