# 3주차 과제

## 📝 과제 내용

**각 Entity에 대응하는 Controller 구현**

Entity가 2개이므로 Controller도 2개를 작성합니다.

- ✅ CRUD 기능에 해당하는 메서드 구현 (생성 / 조회 / 수정 / 삭제)
- ✅ DTO는 세부 구현 없이 **class만 생성**
- ❌ Controller에 **어노테이션과 매핑은 사용하지 않기** (`@RestController`, `@GetMapping` 등 없이 순수 자바 클래스로 작성)

> 어노테이션은 다음 시간에 다시 다룰 예정이니 이번에는 쓰지 않아도 됩니다.

> 작성하면서 오류(빨간 줄)가 나타나도 무시하고 진행해도 됩니다.

## 💡 작성 예시

Controller 클래스 이름은 `엔티티이름Controller` 형식으로 지어주세요. (예: `Todo` Entity → `TodoController`)

```java
public class TodoController {

    // @RequiredArgsConstructor가 있다고 생각하고 생성자는 작성하지 않습니다.
    private final TodoService todoService;

    // 단건 조회 예시
    public TodoResponseDTO getTodo(Long id) {
        return todoService.getTodo(id);
    }
}
```

> `TodoService`는 예시를 위한 클래스라서 이번 과제에서 직접 만들지 않아도 됩니다.

DTO는 이름 끝에 `DTO`를 붙여서 DTO라는 걸 바로 알 수 있게 짓고, 아래처럼 class만 만들어두면 됩니다.

```java
public class TodoResponseDTO {
}
```

> 예시는 `getTodo` 하나만 보여드린 거예요. 나머지 CRUD 메서드(생성 / 목록 조회 / 수정 / 삭제)는 같은 방식으로 직접 작성해보세요.

## ⏰ 제출 기한

**10월 27일(화) 23:59까지**

## 📮 제출 방법

### 1. 내 이름 폴더 만들고 파일 넣기

본인 이름으로 브랜치를 만든 뒤, `2026-2/week3/` 안에 `[3주차] 본인이름` 폴더를 만들고 작성한 파일들을 넣어주세요.

```
2026-2/week3/
└── [3주차] 본인이름/
    ├── 엔티티1이름Controller.java    예) TodoController.java
    ├── 엔티티2이름Controller.java
    └── DTO class 파일들              예) TodoResponseDTO.java
```

### 2. main 브랜치로 PR 제출

- `base: main` ← `compare: 본인이름` 으로 PR을 생성합니다.
- PR 제목: `[3주차] 본인이름 학습 PR 제출합니다.`

> 사람마다 폴더가 나뉘어 있어서 파일이 겹치지 않으니, 다른 사람의 PR과 충돌 걱정 없이 올리셔도 됩니다.

## ✅ 제출 전 체크

- [ ] Entity마다 Controller가 하나씩, 총 2개 있나요?
- [ ] 각 Controller에 CRUD 메서드가 있나요?
- [ ] DTO는 class만 만들었나요?
- [ ] 폴더 이름과 PR 제목이 `[3주차] 본인이름` 형식인가요?

## 💬 질문이 있다면

막히는 부분이 있으면 언제든 단톡방이나 개인톡으로 편하게 물어봐주세요!
