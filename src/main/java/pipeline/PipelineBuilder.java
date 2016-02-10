package pipeline;

import collector.FileDataCollector;
import enricher.LikeMapper;
import filter.LikeFilter;

/**
 * Created by szabolcs on 07/02/16.
 */
public class PipelineBuilder {

    private FileDataCollector fileDataCollector;

    private LikeMapper likeMapper;

    private LikeFilter likeFilter;

    public void setFileDataCollector(FileDataCollector fileDataCollector) {
        this.fileDataCollector = fileDataCollector;
    }

    public void setLikeMapper(LikeMapper likeMapper) {
        this.likeMapper = likeMapper;
    }

    public void setLikeFilter(LikeFilter likeFilter) {
        this.likeFilter = likeFilter;
    }

??
}
