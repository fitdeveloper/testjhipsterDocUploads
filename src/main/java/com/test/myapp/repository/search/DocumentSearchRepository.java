package com.test.myapp.repository.search;

import com.test.myapp.domain.Document;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link Document} entity.
 */
public interface DocumentSearchRepository extends ElasticsearchRepository<Document, Long> {
}
