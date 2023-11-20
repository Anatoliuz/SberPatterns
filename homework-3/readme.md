homework-3



curl -v -d '{"name":"Ivan"}' -H "Content-Type: application/json; charset=utf-8" -X POST http://localhost:8081/student


curl -v -d '{"request-details": { "requestUid": "7f151d5a-a6e5-45c3-a12a-bc0f474ea68e"}, "name":"Ivan"}' -H "Content-Type: application/json; charset=utf-8" -X POST http://localhost:8081/student