package com.example.hw2_q1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.hw2_q1.ui.theme.HW2Q1Theme
import  androidx.compose.material3.Card
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HW2Q1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        Quote(
                            modifier = Modifier.padding(innerPadding)
                        )
                }
            }
        }
    }
}
@Composable
fun Quote(modifier: Modifier = Modifier) {
    var i: Int by remember {
        mutableStateOf(value = 0)
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier
                .height(200.dp)
                .width(260.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
            ),
            border = BorderStroke(1.dp, Color.Black),
        ) {
            Text(
                text = category[i],
                fontSize = 25.sp,
                modifier = Modifier.padding(horizontal = 5.dp, vertical = 5.dp)
            )
            Text(
                text = quotes[i],
                fontSize = 15.sp,
                modifier = Modifier.padding(horizontal = 5.dp, vertical = 5.dp)
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {
            i = Random.nextInt(0, category.size)
        }) {
            Text(
                text = "Change quote",
                fontSize = 15.sp,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HW2Q1Theme {
            Quote()
        }
}



val category = arrayOf(
    "Literacy",
    "Good manners",
    "Hard work",
    "Making a difference",
    "Good manners",
    "Listening",
    "Smile",
    "Cheer",
    "Purpose",
    "Respect",
    "Live your dreams",
    "Inspiration",
    "Cheer",
    "Teaching by example",
    "Appreciating nature",
    "Hope",
    "Courage",
    "Courtesy",
    "Responsibility",
    "Peace",
    "Live life",
    "Curiosity",
    "Forgiveness",
    "Passion",
    "Achievement",
    "Cheer",
    "Joy",
    "Equality",
    "Vision",
    "Education",
    "Believe in yourself",
    "Persistence",
    "Love",
    "Purpose",
    "Mindfulness",
    "Resilience",
    "Optimism",
    "Joy",
    "Creativity",
    "Passion",
    "Kindness",
    "Common ground",
    "Community",
    "Learning",
    "Appreciating nature",
    "Appreciating nature",
    "Including others",
    "Compassion",
    "Vision",
    "Discovery"
)

val quotes = arrayOf(
    "life, seek the company of a friendly book… from the reading of 'good books' there comes a richness of life that can be obtained in no other way. ",
    "Respect for ourselves guides our morals; respect for others guides our manners. ",
    "There is no development physically or intellectually without effort, and effort means work. ",
    "Each one of us can make a difference. Together we make a change. ",
    "Good manners sometimes means simply putting up with other people's bad manners.",
    "Deep listening is the kind of listening that can help relieve the suffering of another person. ",
    "Smile at the obstacle, for it is a bridge. ",
    "Carry good cheer in the morning; \nCarry good cheer in the night. Effort is sweeter and living completer,if ever we walk in love's light. ",
    "It's not so much how busy you are, but why you are busy. ",
    "In recognizing the humanity of our fellow beings, we pay ourselves the highest tribute. ",
    "The biggest adventure you can take is to live the life of your dreams. ",
    "There is no passion to be found playing small - in settling for a life that is less than the one you are capable of living. ",
    "May you always be blessed with walls for the wind. A roof for the rain. A warm cup of tea by the fire. Laughter to cheer you. Those you love near you. And all that your heart might desire. ",
    "The mediocre teacher tells. The good teacher explains. The superior teacher demonstrates. The great teacher inspires. ",
    "Those who find beauty in all of nature will find themselves at one with the secrets of life itself. ",
    "There are always flowers for those who want to see them. ",
    "With courage you will dare to take risks, have the strength to be compassionate, and the wisdom to be humble. Courage is the foundation of integrity. ",
    "Courtesies of a small and trivial character are the ones which strike deepest in the grateful and appreciating heart. ",
    "It is not only for what we do that we are held responsible, but also for what we do not do. ",
    "Peace. It does not mean to be in a place where there is no noise, trouble or hard work. It means to be in the midst of those things and still be calm in your heart. ",
    "Do not let making a living prevent you from making a life. ",
    "Above all, watch with glittering eyes the whole world around you, because the greatest secrets are always hidden in the most unlikely places. ",
    "True forgiveness is when you can say 'Thank you for that experience'. ",
    "Passion is one great force that unleashes creativity, because if you're passionate about something, then you're more willing to take risks. ",
    "To laugh often and much; To win the respect of intelligent people and the affection of children; To earn the appreciation of honest critics and endure the betrayal of false friends; To appreciate beauty, to find the best in others; To leave the world a bit better, whether by a healthy child, a garden patch, or a redeemed social condition; To know even one life has breathed easier because you have lived. This is to have succeeded. ",
    "After every storm the sun will smile; for every problem there is a solution, and the soul's indefeasible duty is to be of good cheer. ",
    "The joy we feel has little to do with the circumstances of our lives and everything to do with the focus of our lives. ",
    "We may have different religions, different languages, different colored skin, but we all belong to one human race. We all share the same basic values. ",
    "The only thing worse than being blind is having sight and no vision. ",
    "Education is not the filling of a pail, but the lighting of a fire. ",
    "It is our privilege and our adventure to discover our own special light. ",
    "You keep putting one foot in front of the other, and then one day you look back and you've climbed a mountain. ",
    "Love is a force more formidable than any other. It is invisible—it cannot be seen or measured, yet it is powerful enough to transform you in a moment, and offer you more joy than any material possession could. ",
    "He who has a why to live for can bear almost any how. ",
    "You must live in the present, launch yourself on every wave, find your eternity in each moment. Fools stand on their island of opportunities and look toward another land. There is no other land; there is no other life but this. ",
    "When I dare to be powerful to use my strength in the service of my vision then it becomes less and less important whether I am afraid. ",
    "A pessimist sees the difficulty in every opportunity; an optimist sees the opportunity in every difficulty. ",
    "Participate joyfully in the sorrows of the world. We cannot cure the world of sorrows, but we can choose to live in joy. ",
    "Creative people do not see things for what they are; they see them for what they can be. ",
    "Pursue your passion, and everything else will fall into place. This is not being romantic. This is the highest order of pragmatism. ",
    "Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma- which is living with the results of other people's thinking. Don't let the noise of other's opinions drown out your own inner voice. And most important, have the courage to follow your heart and intuition. They somehow already know what you truly want to become. Everything else is secondary. ",
    "Humankind has not woven the web of life. We are but one thread within it. Whatever we do to the web, we do to ourselves. All things are bound together. All things connect. ",
    "If you want to go fast, go alone. If you want to go far, go together. ",
    "Aim for success, not perfection. Never give up your right to be wrong, because then you will lose the ability to learn new things and move forward with your life.  ",
    "I felt my lungs inflate with the onrush of scenery—air, mountains, trees, people. I thought, 'This is what it is to be happy.' ",
    "Nature is painting for us, day after day, pictures of infinite beauty. ",
    "Have a big enough heart to love unconditionally, and a broad enough mind to embrace the differences that make each of us unique. ",
    "Compassion is the sometimes fatal capacity for feeling what it is like to live inside somebody else's skin. It's the knowledge that there can never really be any peace and joy for me until there is peace and joy finally for you too. ",
    "The real voyage of discovery consists of not in seeking new landscapes but in having new eyes. ",
    "The greatest discovery of all time is that a person can change their future by merely changing their attitude. "  )