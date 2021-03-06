/*
 *     Kotify is a lightweight and modern Kotlin API Wrapper for Spotify.
 *     Copyright (C) 2021  Conor Byrne <https://github.com/cbyrneee>
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package dev.cbyrne.kotify.api

import dev.cbyrne.kotify.api.section.user.KotifyAPIUserSection
import dev.cbyrne.kotify.builder.credentials.KotifyCredentials

/**
 * The main class that handles interaction between Kotify and the Spotify API
 *
 * @param credentials The credentials used to exchange information with the Spotify API
 */
class KotifyAPI(internal val credentials: KotifyCredentials) {
    /**
     * The base URL for the Spotify API
     */
    internal val url = "https://api.spotify.com/v1"

    /**
     * Information related to the user
     * For example: profile, playback state, etc.
     */
    val user = KotifyAPIUserSection(this)
}
