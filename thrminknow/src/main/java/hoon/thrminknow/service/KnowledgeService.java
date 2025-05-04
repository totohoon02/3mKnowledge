package hoon.thrminknow.service;

import hoon.thrminknow.domain.Knowledge;
import hoon.thrminknow.domain.dto.KnowledgeCreateDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class KnowledgeService {

    private final ChatModel chatModel;

    public Knowledge createKnowledge(KnowledgeCreateDTO knowledgeCreateDTO) {
        return null;
    }

    public String hello(){
        String hello = chatModel.call(new UserMessage("hello"));
        System.out.println("hello = " + hello);
        return hello;
    }
}
