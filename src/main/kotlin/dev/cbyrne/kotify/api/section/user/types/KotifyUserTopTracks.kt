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

package dev.cbyrne.kotify.api.section.user.types

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonObject

@Serializable
data class KotifyUserTopTracks(
    val items: List<KotifyUserCurrentTrack.Item>? = null,
    val total: Long? = null,
    val limit: Long? = null,
    val offset: Long? = null,
    val previous: JsonObject? = null,
    val href: String? = null,
    val next: String? = null
)
