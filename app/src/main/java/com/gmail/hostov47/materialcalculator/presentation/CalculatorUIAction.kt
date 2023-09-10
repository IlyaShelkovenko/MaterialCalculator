/**
 * Created by Ilia Shelkovenko on 10.09.2023.
 */

package com.gmail.hostov47.materialcalculator.presentation

import androidx.compose.runtime.Composable
import com.gmail.hostov47.materialcalculator.domain.CalculatorAction


data class CalculatorUiAction(
    val text: String?,
    val highlightLevel: HighlightLevel,
    val action: CalculatorAction,
    val content: @Composable () -> Unit = {}
)

sealed interface HighlightLevel {
    object Neutral: HighlightLevel
    object SemiHighlighted: HighlightLevel
    object Highlighted: HighlightLevel
    object StronglyHighlighted: HighlightLevel
}