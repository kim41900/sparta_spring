package com.sparta.service;

import com.sparta.domain.Memo;
import com.sparta.domain.MemoDto;
import com.sparta.domain.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class MemoService {
    private final MemoRepository memoRepository;

    @Transactional
    public Long update(Long id, MemoDto memoDto){
        Memo memo = memoRepository.findById(id).orElseThrow(
                ()->new IllegalMonitorStateException("아이디가 없습니다")
        );
        memo.update(memoDto);
        return id;
    }



}
