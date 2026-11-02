package com.example.todo.domain.notice.controller;

public class NoticeController {

    private final NoticeService noticeService;

    public NoticeDetailResponseDto createNotice( NoticeCreateRequestDto request){
        return noticeService.create(request);
    }

    public NoticeDetailResponseDto updateNotice( Long noticeId, NoticeUpdateRequestDto request){
        return noticeService.update(noticeId, request);
    }

    public void deleteNotice( Long noticeId) {
        noticeService.delete(noticeId);
    }

    public NoticeDetailResponseDto getNotice( Long noticeId) {
        return noticeService.getNotice(noticeId);
    }
}
