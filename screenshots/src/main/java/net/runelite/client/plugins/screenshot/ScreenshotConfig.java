/*
 * Copyright (c) 2018, Lotto <https://github.com/devLotto>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.screenshot;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Keybind;
import net.runelite.client.util.ImageUploadStyle;

@ConfigGroup("screenshots")
public interface ScreenshotConfig extends Config
{
	@ConfigItem(
		keyName = "includeFrame",
		name = "Include Client Frame",
		description = "Configures whether or not the client frame is included in screenshots",
		position = 0
	)
	default boolean includeFrame()
	{
		return true;
	}

	@ConfigItem(
		keyName = "includeOverlays",
		name = "Include overlays",
		description = "Configures whether or not the client overlays are included in screenshots (For art only)",
		position = 1
	)
	default boolean includeOverlays()
	{
		return true;
	}

	@ConfigItem(
		keyName = "displayDate",
		name = "Display Date",
		description = "Configures whether or not the report button shows the date the screenshot was taken",
		position = 2
	)
	default boolean displayDate()
	{
		return true;
	}

	@ConfigItem(
		keyName = "notifyWhenTaken",
		name = "Notify When Taken",
		description = "Configures whether or not you are notified when a screenshot has been taken",
		position = 3
	)
	default boolean notifyWhenTaken()
	{
		return true;
	}

	@ConfigItem(
		keyName = "rewards",
		name = "Screenshot Rewards",
		description = "Configures whether screenshots are taken of clues, barrows, and quest completion",
		position = 4
	)
	default boolean screenshotRewards()
	{
		return true;
	}

	@ConfigItem(
		keyName = "levels",
		name = "Screenshot Levels",
		description = "Configures whether screenshots are taken of level ups",
		position = 5
	)
	default boolean screenshotLevels()
	{
		return true;
	}

	@ConfigItem(
		keyName = "kingdom",
		name = "Screenshot Kingdom Reward",
		description = "Configures whether screenshots are taken of Kingdom Reward",
		position = 6
	)
	default boolean screenshotKingdom()
	{
		return true;
	}

	@ConfigItem(
		keyName = "pets",
		name = "Screenshot Pet",
		description = "Configures whether screenshots are taken of receiving pets",
		position = 7
	)
	default boolean screenshotPet()
	{
		return true;
	}

	@ConfigItem(
		keyName = "uploadScreenshot",
		name = "Upload",
		description = "Configures whether or not screenshots are uploaded to Imgur, or placed on your clipboard",
		position = 8
	)
	default ImageUploadStyle uploadScreenshot()
	{
		return ImageUploadStyle.NEITHER;
	}

	@ConfigItem(
		keyName = "kills",
		name = "Screenshot PvP Kills",
		description = "Configures whether or not screenshots are automatically taken of PvP kills",
		position = 9
	)
	default boolean screenshotKills()
	{
		return false;
	}

	@ConfigItem(
		keyName = "pvpKillsMode",
		name = "Pvp Kills",
		description = "Pvp Kill Screenshot mode",
		position = 10
	)
	default PvPKillScreenshotMode pvpKillScreenshotMode()
	{
		return PvPKillScreenshotMode.ON_LOOT;
	}

	@ConfigItem(
		keyName = "boss",
		name = "Screenshot Boss Kills",
		description = "Configures whether or not screenshots are automatically taken of boss kills",
		position = 10
	)
	default boolean screenshotBossKills()
	{
		return false;
	}

	@ConfigItem(
		keyName = "friendDeath",
		name = "Friend Deaths",
		description = "Configures whether or not screenshots are automatically taken when a clanmate or a friend near you dies.",
		position = 11
	)
	default boolean screenshotFriendDeath()
	{
		return false;
	}

	@ConfigItem(
		keyName = "playerDeath",
		name = "Screenshot Deaths",
		description = "Configures whether or not screenshots are automatically taken when you die.",
		position = 12
	)
	default boolean screenshotPlayerDeath()
	{
		return false;
	}

	@ConfigItem(
		keyName = "duels",
		name = "Screenshot Duels",
		description = "Configures whether or not screenshots are automatically taken of the duel end screen.",
		position = 13
	)
	default boolean screenshotDuels()
	{
		return false;
	}

	@ConfigItem(
		keyName = "valuableDrop",
		name = "Screenshot Valuable drops",
		description = "Configures whether or not screenshots are automatically taken when you receive a valuable drop.",
		position = 14
	)
	default boolean screenshotValuableDrop()
	{
		return false;
	}

	@ConfigItem(
		keyName = "untradeableDrop",
		name = "Screenshot Untradeable drops",
		description = "Configures whether or not screenshots are automatically taken when you receive an untradeable drop.",
		position = 15
	)
	default boolean screenshotUntradeableDrop()
	{
		return false;
	}

	@ConfigItem(
		keyName = "ccKick",
		name = "Screenshot Kicks from CC",
		description = "Take a screenshot when you kick a user from a clan chat.",
		position = 16
	)
	default boolean screenshotCcKick()
	{
		return false;
	}

	@ConfigItem(
		keyName = "hotkey",
		name = "Screenshot hotkey",
		description = "When you press this key a screenshot will be taken",
		position = 17
	)
	default Keybind hotkey()
	{
		return Keybind.NOT_SET;
	}

	// TODO: Dev begin
	@ConfigItem(
			keyName = "mentions",
			name = "Screenshot Mentions",
			description = "Configures whether screenshots are taken when the player is mentioned in chat.",
			position = 18
	)
	default boolean screenshotMentions() { return false; }
	// TODO: Dev end
}