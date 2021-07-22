package com.sparta.controller;

import com.sparta.domain.Memo;
import com.sparta.domain.MemoDto;
import com.sparta.domain.MemoRepository;
import com.sparta.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemoController {

    private final MemoService memoService;
    private final MemoRepository memoRepository;

    @PostMapping("/api/memos")
    public Memo postMemo(@RequestBody MemoDto memoDto) {
        Memo memo = new Memo(memoDto);
        return memoRepository.save(memo);
    }

    @GetMapping("/api/memos")
    public List<Memo> getMemo(){
        return memoRepository.findAllByOrderByModifiedAtDesc();
    }

    @DeleteMapping("/api/memos/{id}")
    public  Long deleteMemo(@PathVariable Long id){
        memoRepository.deleteById(id);
        return id;
    }

    @PutMapping("/api/memos/{id}")
    public Long updateMemo(@PathVariable Long id, @RequestBody MemoDto memoDto){
        memoService.update(id,memoDto);
        return id;
    }
}
