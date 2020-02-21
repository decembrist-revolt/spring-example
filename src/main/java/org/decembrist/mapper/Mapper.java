package org.decembrist.mapper;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class to map from S to D
 * @param <S>	source class
 * @param <D>	destination class
 */
public interface Mapper<S, D> {

	D map(S source);

	default List<D> map(Collection<S> source) {
		return source.stream()
				.map(this::map)
				.collect(Collectors.toList());
	}

}
