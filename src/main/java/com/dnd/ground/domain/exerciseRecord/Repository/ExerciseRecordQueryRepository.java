package com.dnd.ground.domain.exerciseRecord.Repository;

import com.dnd.ground.domain.challenge.Challenge;
import com.dnd.ground.domain.challenge.ChallengeStatus;
import com.dnd.ground.domain.exerciseRecord.ExerciseRecord;
import com.dnd.ground.domain.exerciseRecord.dto.RankCond;
import com.dnd.ground.domain.exerciseRecord.dto.RankDto;
import com.dnd.ground.domain.user.User;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * @description 운동 기록 query 인터페이스
 * @author  박찬호
 * @since   2022-08-01
 * @updated 1.함께하는 챌린지 조회 쿼리 작성
 *          2.친구와 함께하는 챌린지 조회(+랭킹 정보) 쿼리 작성
 */

public interface ExerciseRecordQueryRepository {
    List<ExerciseRecord> findRecordOfThisWeek(Long id);
    List<ExerciseRecord> findRecord(Long id, LocalDateTime start, LocalDateTime end);
    List<RankDto> findRankMatrixRankAllTime(RankCond condition);
    List<RankDto> findRankArea(RankCond condition);
    List<RankDto> findRankStep(RankCond condition);
    Map<Challenge, List<RankDto>> findChallengeMatrixRank(User targetUser, ChallengeStatus status);
    Map<Challenge, List<RankDto>> findChallengeMatrixRankWithFriend(User targetUser, User friend, ChallengeStatus status);
}
