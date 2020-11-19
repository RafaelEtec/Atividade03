package com.example.atividade03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Religions> lstReligions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstReligions = new ArrayList<>();

        lstReligions.add(new Religions("+ 2 Bilhões", "Catolicismo", "É uma Igreja cristã, a mais antiga, e maior delas, tendo aproximadamente dois mil anos de existência.", R.drawable.catolica));
        lstReligions.add(new Religions("+/- 100 Mil", "Dodecateísmo", "Refere-se a diversos movimentos reconstrucionistas que tentam reviver, desde a década de 1990, as práticas religiosas da Grécia Antiga, readoptando o seu estilo de vida, as suas virtudes e seus os valores.", R.drawable.dodecateismo));
        lstReligions.add(new Religions("+ 15 Milhões", "Espiritismo", "É uma doutrina religiosa, filosófica, mediúnica e moderno espiritualista de moral cristã codificada pelo pedagogo francês Hippolyte Léon Denizard Rivail, que usava o pseudônimo Allan Kardec.", R.drawable.espiritismo));
        lstReligions.add(new Religions("+ 900 Milhões", "Hinduísmo", "É uma tradição religiosa que se originou no subcontinente indiano. É frequentemente chamado de Sanātana Dharma (सनातन धर्म) pelos seus praticantes, frase em sânscrito que significa \"a eterna (perpétua) darma (lei).", R.drawable.hinduismo));
        lstReligions.add(new Religions("+ 1.5 Bilhões", "Islamismo", "É uma religião abraâmica monoteísta articulada pelo Alcorão, um texto considerado pelos seus seguidores como a palavra literal de Deus (Alá, em árabe: الله), e pelos ensinamentos e exemplos normativos de Maomé.", R.drawable.islamismo));
        lstReligions.add(new Religions("+ 8 Milhões", "jainismo", "É uma das religiões mais antigas da Índia, juntamente com o hinduísmo e o budismo, compartilhando com este último a ausência de um Deus como criador ou figura central da religião.", R.drawable.jainismo));
        lstReligions.add(new Religions("+ 15 Milhões", "Judaísmo", "É uma das três principais religiões abraâmicas, definida como \"religião, filosofia e modo de vida\" do povo judeu. Originário da Torá Escrita e da Bíblia Hebraica (também conhecida como Tanakh) e explorado em textos posteriores, como o Talmud.", R.drawable.judaismo));
        lstReligions.add(new Religions("+/- 450 Mil", "Konkokyo", "É um ensinamento de vida e uma prática de fé dada por Konko Daijin (1814-1883), no Japão há 150 anos. Também é uma instituição religiosa japonesa que tem raízes no Xintoísmo. Foi fundada em 1859 na cidade de Konko, província de Okayama, no Japão.", R.drawable.konkokyo));
        lstReligions.add(new Religions("+ 1 Milhão", "Messianismo", "É, em termos restritos, a crença na vinda - ou no retorno - de um enviado divino libertador, um messias, com poderes e atribuições que aplicará ao cumprimento da causa de um povo ou um grupo oprimido.", R.drawable.messianismo));
        lstReligions.add(new Religions("+ 16 Milhões", "Mormonismo", "Grupo religioso restauracionista iniciado no século XIX nos Estados Unidos e liderado inicialmente por Joseph Smith Jr., definido pelos seus seguidores como primeiro profeta desta época.", R.drawable.mormon));
        lstReligions.add(new Religions(getString(R.string.ndn), "Panteismo", "É a crença de que absolutamente tudo e todos compõem um Deus abrangente, e imanente, ou que o Universo (ou a Natureza) e Deus são idênticos. Os adeptos dessa posição, os panteístas, não acreditam num deus pessoal ou criador.", R.drawable.panteismo));
        lstReligions.add(new Religions("+ 700 Mil", "Rastafarianismo", "É um movimento religioso judaico-cristão surgido na Jamaica, na década de 1930, entre negros camponeses descendentes de africanos escravizados.", R.drawable.rastafarianismo));
        lstReligions.add(new Religions(getString(R.string.ndn), "Satanismo", "É composto por várias crenças ideológicas, filosóficas e fenômenos sociais. As características comuns entre elas incluem associação simbólica, admiração e até veneração ao personagem religioso Satanás, de outras figuras rebeldes similares, e figuras libertadoras.", R.drawable.satanismo));
        lstReligions.add(new Religions("+ 800 Mil", "Seiho-no-ie", "A instituição religiosa se caracteriza pelo não-sectarismo, pelo estímulo ao autoaperfeiçoamento espiritual, pela reverência aos antepassados e, atualmente, pela defesa das relações harmônicas entre a humanidade e a natureza.", R.drawable.seicho));
        lstReligions.add(new Religions("+ 24 Milhões", "Siquismo", "É uma religião monoteísta fundada em fins do século XV no Punjab por Guru Nanak (1469-1539). É por vezes retratado como o resultado de um sincretismo entre elementos do hinduísmo e do Islamismo e Sufismo.", R.drawable.siquismo));
        lstReligions.add(new Religions("+ 400 Milhões", "Taoísmo", "É uma tradição filosófica e religiosa originária do Leste Asiático que enfatiza a vida em harmonia com o Tao (romanizado atualmente como \"Dao\"). O termo chinês \"Tao\" significa \"caminho\", \"via\" ou \"princípio\".", R.drawable.taoismo));
        lstReligions.add(new Religions(getString(R.string.ndn), "Thelema", "É uma filosofia religiosa baseada em um postulado de mesmo nome, adotado como princípio fundamental por algumas organizações ocultistas, desenvolvida no início de 1900 por Aleister Crowley, um escritor inglês e mago cerimonial.", R.drawable.thelema));
        lstReligions.add(new Religions("+ 430 Mil", "Umbanda", "É uma religião brasileira, que sintetiza vários elementos das religiões africanas e cristãs, porém sem ser definida por eles. Formada no início do século XX no sudeste do Brasil.", R.drawable.umbanda));
        lstReligions.add(new Religions("+ 12 Milhões", "Wicca", "É uma religião neopagã influenciada por crenças pré-cristãs, ou seja, crenças anteriores ao cristianismo e práticas da Europa ocidental que afirma a existência do sobrenatural e os princípios físicos, espirituais femininos e masculinos que interagem com a natureza.", R.drawable.wicca));
        lstReligions.add(new Religions("+ 27 Milhões", "Xintoísmo", "É uma antiga religião politeísta do Japão, de origem autóctone e ainda professada nos dias atuais, caracterizada pela adoração a divindades que representam as forças da natureza, e pela ausência de escrituras sagradas.", R.drawable.xintoismo));

        RecyclerView mRecyclerView = findViewById(R.id.id_recyclerView);
        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(getApplicationContext(), lstReligions);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(mAdapter);
    }
}