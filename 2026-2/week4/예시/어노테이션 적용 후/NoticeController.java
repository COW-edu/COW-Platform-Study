package com.example.todo.domain.notice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notices")
@RequiredArgsConstructor
public class NoticeController {

    private final NoticeService noticeService;

    @PostMapping
    public NoticeDetailResponseDto createNotice(@RequestBody NoticeCreateRequestDto request) {
        return noticeService.create(request);
    }

    @PutMapping("/{noticeId}")
    public NoticeDetailResponseDto updateNotice(@PathVariable Long noticeId, @RequestBody NoticeUpdateRequestDto request) {
        return noticeService.update(noticeId, request);
    }

    @DeleteMapping("/{noticeId}")
    public void deleteNotice(@PathVariable Long noticeId) {
        noticeService.delete(noticeId);
    }

    @GetMapping("/{noticeId}")
    public NoticeDetailResponseDto getNotice(@PathVariable Long noticeId) {
        return noticeService.getNotice(noticeId);
    }
}
