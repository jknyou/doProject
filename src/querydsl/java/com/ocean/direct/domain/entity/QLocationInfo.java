package com.ocean.direct.domain.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QLocationInfo is a Querydsl query type for LocationInfo
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QLocationInfo extends EntityPathBase<LocationInfo> {

    private static final long serialVersionUID = -689368340;

    public static final QLocationInfo locationInfo = new QLocationInfo("locationInfo");

    public final DateTimePath<java.util.Date> createdTime = createDateTime("createdTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Double> latitude = createNumber("latitude", Double.class);

    public final NumberPath<Double> longitude = createNumber("longitude", Double.class);

    public QLocationInfo(String variable) {
        super(LocationInfo.class, forVariable(variable));
    }

    @SuppressWarnings("all")
    public QLocationInfo(Path<? extends LocationInfo> path) {
        super((Class)path.getType(), path.getMetadata());
    }

    public QLocationInfo(PathMetadata<?> metadata) {
        super(LocationInfo.class, metadata);
    }

}

