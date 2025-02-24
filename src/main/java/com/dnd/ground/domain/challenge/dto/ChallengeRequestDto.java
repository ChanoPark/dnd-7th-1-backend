package com.dnd.ground.domain.challenge.dto;

import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @description 챌린지와 관련한 Request DTO
 * @author  박찬호
 * @since   2022-08-08
 * @updated 1.@Data 어노테이션 제거
 *          2. 챌린지 목록 페이징을 위한 DTO 추가
 *          - 2023.02.18 박찬호
 */

public class ChallengeRequestDto {
    @Getter
    @AllArgsConstructor
    public static class CInfo {
        @NotBlank(message = "UUID가 필요합니다.")
        @ApiParam(value="UUID", example="11ed1e42ae1af37a895b2f2416025f66", required = true, type="path")
        private String uuid;

        @NotBlank(message = "닉네임이 필요합니다.")
        @ApiParam(value="회원 닉네임", example="NickA", required = true, type="path")
        private String nickname;
    }

    @Getter
    @AllArgsConstructor
    public static class ChallengePageRequest {
        private Long offset;

        @Min(1)
        @NotNull
        private Integer size;

        @NotNull
        private String nickname;
    }
}
