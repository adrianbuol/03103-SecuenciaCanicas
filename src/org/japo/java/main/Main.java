/* 
 * Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public final class Main {

    public static void main(String[] args) {

        // Variables
        int resto;

        //Constantes
        final String Namecanica = "Ruperta";
        final int canicasi = 5;
        final int canicasf = 1;

            System.out.printf("Secuencia de Canicas%n====================%n");
            System.out.printf("Nombre de la canica ..........: %s%n"
                    , Namecanica);
            System.out.printf("---%n");
            System.out.printf("Número de canicas inicial ....: %d%n", canicasi);
            System.out.printf("Número de canicas final ......: %d%n", canicasf);
                resto = canicasi - canicasf;
            System.out.printf("---%n");
            System.out.printf(Locale.ENGLISH, "Número de canicas perdidas ...: "
                    + "%d%n", resto);

    }
}
