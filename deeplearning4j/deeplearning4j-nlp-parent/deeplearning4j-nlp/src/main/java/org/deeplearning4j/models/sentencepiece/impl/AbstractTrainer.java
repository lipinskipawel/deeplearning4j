/*******************************************************************************
 * Copyright (c) 2015-2018 Skymind, Inc.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 ******************************************************************************/

package org.deeplearning4j.models.sentencepiece.impl;

import lombok.extern.slf4j.Slf4j;
import org.deeplearning4j.models.sentencepiece.SubwordVocabulary;
import org.deeplearning4j.models.sentencepiece.interfaces.Trainer;
import org.nd4j.linalg.primitives.Pair;

import java.util.*;

@Slf4j
public abstract class AbstractTrainer implements Trainer {
    // corpus
    protected List<Sentence> sentences = new ArrayList<>();

    // charmap
    protected Map<Integer, Long> requiredChars = new HashMap<>();

    protected List<Pair<String, Float>> finalPieces = new ArrayList<>();

    protected int unknownChar;

    /**
     *
     */
    protected abstract void train();

    @Override
    public SubwordVocabulary buildVocabulary(Iterator<String> iterator) {
        return null;
    }

    protected boolean isValidSentencePiece(List<Integer> piece) {
        return false;
    }
}
