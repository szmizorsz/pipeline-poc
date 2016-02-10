package filter;

import domain.ContentType;
import domain.Like;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by szabolcs on 10/02/16.
 */
public final class LikeFilter {

    public static Predicate<Like> isVideoContent() {
        return l -> l.getContentType() == ContentType.video;
    }

    public static List<Like> filterLikes(List<Like> likes, Predicate<Like> predicate) {
        return likes.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
