package com.sebas.gestordenotascortas_geo_sebas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.sebas.gestordenotascortas_geo_sebas.ui.theme.GestorDeNotasCortas_Geo_SebasTheme

class MainActivity : ComponentActivity() {
    private val noteViewModel by viewModels<NoteViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GestorDeNotasCortas_Geo_SebasTheme {
                NoteScreen(noteViewModel)
            }
        }
    }
}

