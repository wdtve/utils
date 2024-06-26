package org.wdt.utils.io

import java.nio.file.Path
import kotlin.io.path.Path

fun Path.readFileToString(): String {
  return PathUtils.readFileToString(this)
}

fun Path.writeStringToFile(string: String, boolean: Boolean = false) {
  PathUtils.writeStringToFile(this, string, boolean)
}

fun Path.writeStringToFile(block: () -> String, boolean: Boolean = false) {
  PathUtils.writeStringToFile(this, block(), boolean)
}


fun Path.touch() {
  PathUtils.touch(this)
}

fun Path.readFileToLines(): List<String> {
  return PathUtils.readFileToLines(this)
}

fun Path.delete() {
  PathUtils.delete(this)
}

fun Path.sizeOf(): Long {
  return PathUtils.sizeOf(this)
}

fun Path.cleanDirectory() {
  PathUtils.cleanDirectory(this)
}

fun Path.deleteDirectory() {
  PathUtils.deleteDirectory(this)
}

fun Path.sizeOfDirectory(): Long {
  return PathUtils.sizeOfDirectory(this)
}

fun Path.isFileExists(): Boolean {
  return PathUtils.isFileExists(this)
}

fun Path.createDirectories() {
  PathUtils.createDirectories(this)
}


fun Path.sha1(): String {
  return PathUtils.getFileSha1(this)
}

fun String.toPath(): Path {
  return Path(this)
}

fun String.toPath(child: String): Path {
  return Path(this, child)
}

fun Path.deleteFile() {
  PathUtils.deleteFile(this)
}