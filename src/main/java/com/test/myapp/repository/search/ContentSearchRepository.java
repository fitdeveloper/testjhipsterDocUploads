package com.test.myapp.repository.search;

import com.test.myapp.domain.Content;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link Content} entity.
 */
public interface ContentSearchRepository extends ElasticsearchRepository<Content, Long> {
}
