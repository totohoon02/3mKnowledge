package hoon.thrminknow.controller;

import hoon.thrminknow.domain.Knowledge;
import hoon.thrminknow.domain.dto.KnowledgeCreateDTO;
import hoon.thrminknow.service.KnowledgeService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/knowledge")
public class KnowledgeController {

    private final KnowledgeService knowledgeService;


    @GetMapping("")
    public String hello(){
        return knowledgeService.hello();
    }

    @PostMapping("")
    public ResponseEntity<Knowledge> createKnowledge(@RequestBody KnowledgeCreateDTO knowledgeCreateDTO) {
        Knowledge knowledge = knowledgeService.createKnowledge(knowledgeCreateDTO);
        return ResponseEntity.ok(knowledge);
    }
}
