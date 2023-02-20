package com.jiowangh.iterator2;

/**
 * @author wangjiong
 * @create 2023/2/20 21:11
 */
public class TopicList implements ListList<Topic> {

    private Topic[] topics;

    public TopicList(Topic[] topics) {
        this.topics = topics;
    }

    @Override
    public IteratorIterator<Topic> Iterator() {
        return new TopicIterator(topics);
    }
}