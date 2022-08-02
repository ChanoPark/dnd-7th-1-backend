package com.dnd.ground.domain.friend.controller;

import com.dnd.ground.domain.friend.dto.FriendResponseDto;
import com.dnd.ground.domain.friend.service.FriendService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


/**
 * @description 친구와 관련된 컨트롤러 구현체
 * @author  박찬호
 * @since   2022-08-01
 * @updated 1. 친구 목록 조회 기능 구현
 *          - 2022.08.02 박찬호
 */

@Api(tags = "친구")
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value = "/friend")
@RestController
public class FriendControllerImpl implements FriendController {

    private final FriendService friendService;

    @GetMapping("/list")
    public FriendResponseDto getFriends(@RequestParam("nickname") String nickname) {
        return friendService.getFriends(nickname);
    }

}
