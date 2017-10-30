package nl.linkit.arra.stateless.services;

import nl.linkit.arra.stateless.models.Phrase;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class EinsteinPhraseServiceImpl implements PhraseService {

    private final static Map<Integer, Phrase> phrases = new HashMap<>();

    static {
        phrases.put(0, new Phrase(0, "When a man sits with a pretty girl for an hour, it seems like a minute. But let him sit on a hot stove for a minute — and it's longer than any hour. That's relativity."));
        phrases.put(1, new Phrase(1, "A happy man is too satisfied with the present to dwell too much on the future."));
        phrases.put(2, new Phrase(2, "As a human being, one has been endowed with just enough intelligence to be able to see clearly how utterly inadequate that intelligence is when confronted with what exists."));
        phrases.put(3, new Phrase(3, "As far as the laws of mathematics refer to reality, they are not certain; and as far as they are certain, they do not refer to reality."));
        phrases.put(4, new Phrase(4, "Common sense is nothing more than a deposit of prejudices laid down in the mind before you reach eighteen."));
        phrases.put(5, new Phrase(5, "I am by heritage a Jew, by citizenship a Swiss, and by makeup a human being, and only a human being, without any special attachment to any state or national entity whatsoever."));
        phrases.put(6, new Phrase(6, "I very rarely think in words at all. A thought comes, and I may try to express in words afterwards."));
        phrases.put(7, new Phrase(7, "If A is a success in life, then A equals X plus Y plus Z. Work is X; Y is play, and Z is keeping your mouth shut."));
        phrases.put(8, new Phrase(8, "If I were to start taking care of my grooming, I would no longer be my own self."));
        phrases.put(9, new Phrase(9, "Imagination is more important than knowledge. Knowledge is limited. Imagination encircles the world."));
        phrases.put(10, new Phrase(10, "It is true that my parents were worried because I began to speak fairly late, so that they even consulted a doctor. I can't say how old I was — but surely not less than three."));
        phrases.put(11, new Phrase(11, "Most teachers waste their time by asking questions that are intended to discover what a pupil does not know, whereas the true art of questioning is to discover what the pupil does know or is capable of knowing."));
        phrases.put(12, new Phrase(12, "My passionate sense of social justice and social responsibility has always contrasted oddly with my pronounced lack of need for direct contact with other human beings and human communities. I am truly a 'lone traveler' and have never belonged to my country, my home, my friends, or even my immediate family, with my whole heart; in the face of all these ties, I have never lost a sense of distance and a need for solitude."));
        phrases.put(13, new Phrase(13, "Nationalism is an infantile sickness. It is the measles of the human race."));
        phrases.put(14, new Phrase(14, "Nature shows us only the tail of the lion. But there is no doubt in my mind that the lion belongs with it even if he cannot reveal himself to the eye all at once because of his huge dimension."));
        phrases.put(15, new Phrase(15, "Nothing truly valuable arises from ambition or from a mere sense of duty; it stems rather from love and devotion towards men and towards objective things."));
        phrases.put(16, new Phrase(16, "One thing I have learned in a long life: That all our science, measured against reality, is primitive and childlike — and yet it is the most precious thing we have."));
        phrases.put(17, new Phrase(17, "The aim[of education] must be the training of independently acting and thinking individuals who, however, see in the service to the community their highest life problem."));
        phrases.put(18, new Phrase(18, "The ideals that have lighted my way, and time after time have given me new courage to face life cheerfully, have been Kindness, Beauty, and Truth. Without the sense of kinship with men of like mind, without the occupation with the objective world, the eternally unattainable in the field of art and scientific endeavors, life would have seemed empty to me. The trite objects of human efforts — possessions, outward success, luxury — have always seemed to me contemptible."));
        phrases.put(19, new Phrase(19, "The important thing is to not stop questioning. Curiosity has its own reason for existing."));
        phrases.put(20, new Phrase(20, "The most beautiful experience we can have is the mysterious. It is the fundamental emotion that stands at the cradle of true art and true science. Whoever does not know it and can no longer wonder, no longer marvel, is as good as dead, and his eyes are dimmed."));
        phrases.put(21, new Phrase(21, "The only way to escape the corruptible effect of praise is to go on working."));
        phrases.put(22, new Phrase(22, "The ordinary adult never gives a thought to space-time problems ... I, on the contrary, developed so slowly that I did not begin to wonder about space and time until I was an adult. I then delved more deeply into the problem than any other adult or child would have done."));
        phrases.put(23, new Phrase(23, "The state of mind which enables a man to do work of this kind ... is akin to that of the religious worshipper or the lover; the daily effort comes from no deliberate intention or program, but straight from the heart."));
        phrases.put(24, new Phrase(24, "Unthinking respect for authority is the greatest enemy of truth."));
    }

    private final Random random = new Random();

    @Override
    public Phrase getRandomPhrase() {
        int phraseId = random.nextInt(phrases.size());
        return phrases.get(phraseId);
    }
}
