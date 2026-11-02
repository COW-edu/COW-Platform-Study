# 4주차 과제

## ⏰ 제출 기한

**11월 4일(수) 23:59까지**

## 📝 과제 내용

지난주 세션 참석 여부에 따라 과제가 달라요.

| 대상 | 과제 |
| --- | --- |
| 🙋 지난주 세션 참석자 | 세션 때 안내한 Controller 코드를 **어노테이션까지 포함해서** 작성 |
| 🙌 지난주 세션 불참자 | [3주차 과제](../week3/README.md)를 진행 |

두 경우 모두 **4주차 폴더**에 올려주세요.

### 🙋 세션 참석자

세션 때 안내한 Controller 코드에 아래 어노테이션을 붙여서 작성해주세요.

| 위치 | 어노테이션 | 역할 |
| --- | --- | --- |
| 클래스 | `@RestController` | 이 클래스가 요청을 받아 데이터를 반환하는 Controller라는 표시 |
| 클래스 | `@RequestMapping("/notices")` | 이 Controller의 공통 URL 경로 지정 |
| 클래스 | `@RequiredArgsConstructor` | `final` 필드를 받는 생성자를 자동으로 만들어줌 (Lombok) |
| 메서드 | `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping` | HTTP 메서드(조회/생성/수정/삭제)와 메서드를 연결 |
| 파라미터 | `@PathVariable` | URL 경로의 값(`/notices/{noticeId}`)을 받음 |
| 파라미터 | `@RequestBody` | 요청 Body(JSON)를 DTO로 받음 |

### 🙌 세션 불참자

[3주차 README](../week3/README.md)의 과제 내용대로 작성해서 4주차 폴더에 올려주세요.

## 💡 예시

`예시` 폴더에 같은 `NoticeController`를 어노테이션 적용 전과 후 두 버전으로 정리했어요. 두 파일을 나란히 비교해보면 어디에 어떤 어노테이션이 붙는지 볼 수 있어요.

| 버전 | 참고 대상 |
| --- | --- |
| [어노테이션 적용 전](예시/어노테이션%20적용%20전/NoticeController.java) | 세션 불참자 (3주차 과제 형태) |
| [어노테이션 적용 후](예시/어노테이션%20적용%20후/NoticeController.java) | 세션 참석자 (4주차 과제 형태) |

## 📮 제출 방법

### 1. 내 이름 폴더 만들고 파일 넣기

본인 이름으로 브랜치를 만든 뒤, `2026-2/week4/` 안에 `[4주차] 본인이름` 폴더를 만들고 작성한 파일들을 넣어주세요.

```
2026-2/week4/
└── [4주차] 본인이름/
    ├── 엔티티1이름Controller.java    예) NoticeController.java
    ├── 엔티티2이름Controller.java
    └── DTO class 파일들
```

### 2. main 브랜치로 PR 제출

- `base: main` ← `compare: 본인이름` 으로 PR을 생성합니다.
- PR 제목: `[4주차] 본인이름 학습 PR 제출합니다.`

> 사람마다 폴더가 나뉘어 있어서 파일이 겹치지 않으니, 다른 사람의 PR과 충돌 걱정 없이 올리셔도 됩니다.

## ✅ 제출 전 체크

**세션 참석자**

- [ ] 클래스에 `@RestController`, `@RequestMapping`, `@RequiredArgsConstructor`를 붙였나요?
- [ ] CRUD 메서드마다 맞는 매핑 어노테이션(`@GetMapping` 등)을 붙였나요?
- [ ] URL 경로 값은 `@PathVariable`, 요청 Body는 `@RequestBody`로 받았나요?

**세션 불참자**

- [ ] [3주차 README](../week3/README.md)의 체크리스트를 모두 확인했나요?

**공통**

- [ ] 폴더 이름과 PR 제목이 `[4주차] 본인이름` 형식인가요?

## 💬 질문이 있다면

막히는 부분이 있으면 언제든 단톡방이나 개인톡으로 편하게 물어봐주세요!
