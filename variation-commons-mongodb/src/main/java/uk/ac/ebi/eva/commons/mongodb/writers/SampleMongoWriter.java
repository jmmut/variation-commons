/*
 * Copyright 2017 EMBL - European Bioinformatics Institute
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.ac.ebi.eva.commons.mongodb.writers;

import org.springframework.batch.item.data.MongoItemWriter;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.util.Assert;

import uk.ac.ebi.eva.commons.mongodb.entities.SampleMongo;

public class SampleMongoWriter extends MongoItemWriter<SampleMongo> {

    public SampleMongoWriter(MongoOperations mongoOperations) {
        Assert.notNull(mongoOperations, "A Mongo instance is required");

        this.setTemplate(mongoOperations);
    }
}
