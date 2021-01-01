package com.test.myapp.repository.search;

import com.test.myapp.domain.Car;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link Car} entity.
 */
public interface CarSearchRepository extends ElasticsearchRepository<Car, Long> {
}
