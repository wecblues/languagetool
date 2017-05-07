/* LanguageTool, a natural language style checker
 * Copyright (C) 2016 Marcin Miłkowski (http://www.languagetool.org)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301
 * USA
 */

package org.languagetool.rules.pt;

import org.languagetool.Language;
import org.languagetool.rules.AbstractDashRule;

import java.io.IOException;

/**
 * Check for compounds written with dashes instead of hyphens.
 * @since 3.8
 */
public class PreReformPortugueseDashRule extends AbstractDashRule {

  public PreReformPortugueseDashRule(Language lang) throws IOException {
    super("/pt/pre-reform-compounds.txt",
        "Um travessão foi utilizado em vez de um hífen. Pretende dizer: ", lang);
  }

  @Override
  public String getId() {
    return "PT_PREAO_DASH_RULE";
  }

  @Override
  public String getDescription() {
    return "Verifica se palavras hifenizadas foram escritas com travessões (p.ex., 'T — shirt' em vez de 'T-shirt').";
  }

}
