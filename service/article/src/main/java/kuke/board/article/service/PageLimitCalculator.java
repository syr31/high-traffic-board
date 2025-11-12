package kuke.board.article.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class PageLimitCalculator {

    public static Long calculatePageLimit(Long page, Long pageSize, Long movablePagecount){
        return (((page-1)/movablePagecount+1)*pageSize * movablePagecount +1);
    }
}
