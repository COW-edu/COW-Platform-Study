# to-do list API 명세서

## 할 일 (Todo)

| 기능 | HTTP Method | API Path | param | 설명 |
|------|-------------|----------|-------|------|
| 모든 할 일 목록 조회 | GET | `/api/todos` | | |
| id 조회 | GET | `/api/todos/{id}` | | |
| 할 일 등록 | POST | `/api/todos` | | |
| 카테고리별 할 일 조회 | GET | `/api/todos?category_id={id}` | | |
| 완료 여부 별 할 일 조회 | GET | `/api/todos?completed={true/false}` | | |
| 할 일 내용 수정 | PATCH | `/api/todos/{id}` | | |
| 할 일 완료 여부 수정 | PATCH | `/api/todos/{id}/completed` | | |
| 할 일 카테고리 수정 | PATCH | `/api/todos/{id}/categories` | | |
| 할 일 삭제 | DELETE | `/api/todos/{id}` | | |

## 카테고리 (Category)

| 기능 | HTTP Method | API Path | param | 설명 |
|------|-------------|----------|-------|------|
| 카테고리 목록 조회 | GET | `/api/categories` | | |
| 카테고리 등록 | POST | `/api/categories` | | |
| 카테고리 수정 | PATCH | `/api/categories/{id}` | | |
| 카테고리 삭제 | DELETE | `/api/categories/{id}` | | |
