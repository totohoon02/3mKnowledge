
#!/bin/sh

# Ollama 서버 백그라운드 실행
ollama serve &

# 모델 다운로드
sleep 5
ollama pull gemma3:1b

# Ollama 서버를 foreground로 실행하지 않으면 컨테이너가 종료됩니다.
wait
