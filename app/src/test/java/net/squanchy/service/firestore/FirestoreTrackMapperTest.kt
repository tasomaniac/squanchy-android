package net.squanchy.service.firestore

import org.junit.Assert
import org.junit.Test

private const val FAKE_ID = "ABC123"
private const val FAKE_NAME = "ABCD"
private const val FAKE_COLOR = "#ABCDEF"

class FirestoreTrackMapperTest {

    @Test
    fun `track id should match after mapping`() {
        val firestoreTrack = fixtureOfFirestoreTrack(id = FAKE_ID)
        val track = firestoreTrack.toTrack()
        Assert.assertEquals(FAKE_ID, track.id)
    }

    @Test
    fun `track name should match after mapping`() {
        val firestoreTrack = fixtureOfFirestoreTrack(name = FAKE_NAME)
        val track = firestoreTrack.toTrack()
        Assert.assertEquals(FAKE_NAME, track.name)
    }

    @Test
    fun `track url should match after mapping`() {
        val firestoreTrack = fixtureOfFirestoreTrack(iconUrl = FAKE_NAME)
        val track = firestoreTrack.toTrack()
        Assert.assertEquals(FAKE_NAME, track.iconUrl.get())
    }

    @Test
    fun `track url should be absent when null`() {
        val firestoreTrack = fixtureOfFirestoreTrack(iconUrl = null)
        val track = firestoreTrack.toTrack()
        Assert.assertFalse(track.iconUrl.isPresent)
    }

    @Test
    fun `accent color should match after mapping`() {
        val firestoreTrack = fixtureOfFirestoreTrack(accentColor = FAKE_COLOR)
        val track = firestoreTrack.toTrack()
        Assert.assertEquals(FAKE_COLOR, track.accentColor.get())
    }

    @Test
    fun `accent color should be absent when null`() {
        val firestoreTrack = fixtureOfFirestoreTrack(accentColor = null)
        val track = firestoreTrack.toTrack()
        Assert.assertFalse(track.accentColor.isPresent)
    }

    @Test
    fun `text color should match after mapping`() {
        val firestoreTrack = fixtureOfFirestoreTrack(textColor = FAKE_COLOR)
        val track = firestoreTrack.toTrack()
        Assert.assertEquals(FAKE_COLOR, track.textColor.get())
    }

    @Test
    fun `text color should be absent when null`() {
        val firestoreTrack = fixtureOfFirestoreTrack(textColor = null)
        val track = firestoreTrack.toTrack()
        Assert.assertFalse(track.textColor.isPresent)
    }
}