#!/usr/bin/env coffee
express = require('express')
Commands = require('./omnibus.coffee')
commands = new Commands()

port = 9000

app = express()

app.listen port
console.log("server listening on #{port}")

app.get '/call', (request, response) ->
	atFloor = request.query.atFloor
	to = request.query.to
	commands.call(atFloor,to)
	console.log "called atFloor #{atFloor} to #{to}"
	response.send 200

app.get '/go', (request, response) ->
	floorToGo = request.query.floorToGo
	console.log "go to floor #{floorToGo}"
	response.send 200

app.get '/userHasEntered', (request, response) ->
	console.log "user has entered"
	response.send 200

app.get '/userHasExited', (request, response) ->
	console.log "user has exited"
	response.send 200

app.get '/reset', (request, response) ->
	commands.reset()
	cause = request.query.cause
	console.log "RESET -> #{cause}"
	response.send 200

app.get '/nextCommand', (request, response) ->
	nextCommand = commands.next()
	console.log "Next Command is #{nextCommand}"
	response.set('Content-Type', 'text/plain');
	response.send 200, nextCommand
