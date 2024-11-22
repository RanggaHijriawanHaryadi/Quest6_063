package com.example.petemuan8.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.petemuan8.model.Mahasiswa
import com.example.petemuan8.model.RencanaStudy

@Composable
fun Tampil(
    modifier: Modifier = Modifier,
    uiStateMahasiswa: Mahasiswa,
    uiMahasiswa: RencanaStudy,
    onClickButton: () -> Unit
){
    val listDataMahasiswa = listOf(
        Pair("NIM", uiStateMahasiswa.nim),
        Pair("Nama", uiStateMahasiswa.nama),
        Pair("Email", uiStateMahasiswa.email),
        Pair("MataKuliah", uiMahasiswa.mataKuliah),
        Pair("Kelas", uiMahasiswa.kelas)
    )


    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
        listDataMahasiswa.forEach{items ->
            CardSection(
                judulParam = items.first,
                Isiparams  = items.second
            )
        }
        Spacer(modifier= Modifier.padding(16.dp))
        Button(onClick = {onClickButton()}) {
            Text(text = "HalamanUtama")
        }
    }

}
@Composable
fun CardSection(judulParam : String, Isiparams : String){
    Column(
        horizontalAlignment = Alignment.Start
    ) {

        Row(
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = judulParam, modifier = Modifier.weight(0.8f))
            Text(text = ":", modifier = Modifier.weight(0.2f))
            Text(text = "$Isiparams", modifier = Modifier.weight(2f))
        }

    }
}