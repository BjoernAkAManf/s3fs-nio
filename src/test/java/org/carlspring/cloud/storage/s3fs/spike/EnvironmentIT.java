package org.carlspring.cloud.storage.s3fs.spike;

import org.carlspring.cloud.storage.s3fs.util.EnvironmentBuilder;

import java.util.Map;

import org.junit.jupiter.api.Test;
import static org.carlspring.cloud.storage.s3fs.S3Factory.ACCESS_KEY;
import static org.carlspring.cloud.storage.s3fs.S3Factory.SECRET_KEY;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class EnvironmentIT
{
    @Test
    void couldCreateFileSystem()
    {
        Map<String, Object> res = EnvironmentBuilder.getRealEnv();

        assertNotNull(res);
        assertNotNull(res.get(ACCESS_KEY));
        assertNotNull(res.get(SECRET_KEY));
    }

}
