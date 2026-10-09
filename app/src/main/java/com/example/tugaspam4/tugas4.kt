package com.example.tugaspam4

import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun KartuMahasiswa(
    @StringRes nama: Int,
    @StringRes alamat: Int,
    @ColorRes warnaKartu: Int,
    @ColorRes warnaAlamat: Int,
    @StringRes telepon: Int? = null,
    fontNama: FontFamily? = null,
    gayaNama: FontStyle? = null
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(88.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = colorResource(warnaKartu))
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = stringResource(R.string.logo),
                modifier = Modifier.size(56.dp)
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 8.dp),
                verticalArrangement = Arrangement.spacedBy(2.dp)
            ) {
                Text(
                    text = stringResource(nama),
                    color = colorResource(R.color.text_white),
                    fontSize = 18.sp,
                    fontFamily = fontNama,
                    fontStyle = gayaNama
                )
                Text(
                    text = stringResource(alamat),
                    color = colorResource(warnaAlamat),
                    fontSize = 12.sp
                )
                if (telepon != null) {
                    Text(
                        text = stringResource(telepon),
                        color = colorResource(R.color.text_white),
                        fontSize = 12.sp
                    )
                }
                Image(
                    painter = painterResource(R.drawable.logo_umy),
                    contentDescription = stringResource(R.string.logo),
                    modifier = Modifier.size(56.dp)
                )
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.screen_background))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(72.dp))
        Text(
            text = stringResource(R.string.title),
            color = colorResource(R.color.text_primary),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.subtitle),
            color = colorResource(R.color.text_primary),
            fontSize = 12.sp,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(24.dp))
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            KartuMahasiswa(
                nama = R.string.nama,
                alamat = R.string.alamat,
                warnaKartu = R.color.card_1,
                warnaAlamat = R.color.text_yellow,
                fontNama = FontFamily.Cursive,
                gayaNama = FontStyle.Italic
            )
            KartuMahasiswa(
                nama = R.string.nama2,
                telepon = R.string.nomer2,
                alamat = R.string.alamat2,
                warnaKartu = R.color.card_2,
                warnaAlamat = R.color.text_yellow
            )
            KartuMahasiswa(
                nama = R.string.nama3,
                telepon = R.string.nomer3,
                alamat = R.string.alamat3,
                warnaKartu = R.color.card_3,
                warnaAlamat = R.color.text_white
            )
            KartuMahasiswa(
                nama = R.string.nama4,
                telepon = R.string.nomer4,
                alamat = R.string.alamat4,
                warnaKartu = R.color.card_4,
                warnaAlamat = R.color.text_white
            )
            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = stringResource(R.string.copyright),
                color = colorResource(R.color.text_primary),
                fontSize = 10.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}


